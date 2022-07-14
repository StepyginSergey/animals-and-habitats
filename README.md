# Звери и места их обитания
Приложение

#
### Запуск приложения

Приложение запускается из IntelliJ Idea, как обычное springboot приложение.
При запуске происходит развертывание базы H2 из файлов schema.sql и data.sql

Приложение маппится на адрес: http://localhost:8080/ah/

Swagger доступен: http://localhost:8080/swagger-ui/

Консоль H2 доступна по адресу: http://localhost:8080/h2-console


Запрос для получения всех записей: http://localhost:8080/ah/animals

Запрос для сохранения новой записи: http://localhost:8080/ah/animals
тело запроса:

    {
            "animalName": "Корова",
            "kind": {
                "id": 1,
                "kindName": "Млекопитающие"
            },
            "skinColor": {
                "id": 1,
                "colorName": "Черный"
            },
            "regions": [
                {
                    "id": 3,
                    "name": "Евразия"
                },
                {
                    "id": 2,
                    "name": "Южная америка"
                }
            ]
        }
        
