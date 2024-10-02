FROM python:3.12-slim

COPY . /app

RUN pip install requirements.txt

EXPOSE 8081

CMD ["python", "main.py"]
 