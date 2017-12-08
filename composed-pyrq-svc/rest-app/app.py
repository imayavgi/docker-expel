from flask import Flask
import pika

app = Flask(__name__)


@app.route("/sendMsg/<string:msg>")
def send(msg):
    parameters = pika.URLParameters('amqp://imaya:imaya@rabbitmq:5672/%2F')
    connection = pika.BlockingConnection(parameters)
    channel = connection.channel()
    channel.queue_declare(queue="request", durable=True)
    channel.basic_publish(exchange='', routing_key='request', body=msg, properties=pika.BasicProperties(delivery_mode = 2))
    connection.close()

    html = "<h3>Hello !</h3>" \
       "<b>Message Sent<br/>" \
       "<b>Again</b>"
    return html.format()

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=80)
