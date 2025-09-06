FROM python:3.10-slim

WORKDIR /app

COPY requirement.txt .

RUN pip install -r requirements.txt

COPY . .

EXPOSE 5002

CMD ["python", "app.py"]
