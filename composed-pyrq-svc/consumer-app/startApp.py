from flask import Flask
import time, threading, pika

app = Flask(__name__)

class Threaded_worker(threading.Thread):
	def callback(self, ch, method, properties, body):
		print(' [x] received %r' % (body,))
		time.sleep(5)
		ch.basic_ack(delivery_tag = method.delivery_tag)

	def __init__(self):
		threading.Thread.__init__(self)
		self.parameters = pika.URLParameters('amqp://imaya:imaya@rabbitmq:5672/%2F')
		self.connection = pika.BlockingConnection(self.parameters)
		self.channel = self.connection.channel()
		self.channel.queue_declare(queue='request', durable=True)
		self.channel.basic_qos(prefetch_count=1)
		self.channel.basic_consume(self.callback, queue='request')

	def run(self):
		print('start consuming')
		self.channel.start_consuming()

@app.route("/startConsumer")
def startConsumer():
	print('launch thread')
	td = Threaded_worker()
	td.start()

	html = "<h3>Hello !</h3>" \
	"<b>Consumer Started<br/>" \
	       "<b>Again</b>"
	return html.format()


if __name__ == "__main__":
	app.run(host='0.0.0.0', port=80)
