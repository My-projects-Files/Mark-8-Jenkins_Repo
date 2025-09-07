from flask import Flask
app = Flask(__name__)


@app.route("/orders", strict_slashes=False)
def get_users():
    return {"Orders": ["phone", "laptop", "headphone"]}


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5002)
