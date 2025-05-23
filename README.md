# API Autotests

#### Фреймворк для тестирования апи
---
## 🛠 Зависимости

- Java 21
- RestAssured
- Gradle (используется Wrapper)
- Junit
- Lombok
- Spring Boot

#### Запуск через командную строку
`./gradlew clean test` - запуск всех тестов

---
## 🧪 Генерация локального отчета Allure
### Выполнить команды из командной строки
1. `gradle tasks allureReport` - сгенерирует данные для репорта
2. `gradle tasks allureServe` - запустит веб-сервер и откроет страницу с репортом в браузере

