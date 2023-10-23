# animals

Чтобы поднять контейнеры, находясь в папке с файлом docker-compose.yml нужно выполнить в консоли команду:
docker-compose up

## Получить всех котов
GET http://localhost:8080/cat

## Создать кота
POST http://localhost:8080/cat
JSON body:
{
    "cat": "Мявка",
    "age": 5,
    "color": "белый",
    "gender": "Ж"
}

## Изменить параметры кота по id
PATCH http://localhost:8080/cat/1 
JSON body:
{
    "cat": "Пипявка",
    "age": 6,
    "color": "черный",
    "gender": "М"
}

## Удалить кота по id
DELETE http://localhost:8080/cat/1 
