# 📚 LiterAlura - Book Manager | Angelo Padilla

**LiterAlura** is a book catalog application built with **Java Spring Boot**. It allows users to search, filter, and display book information retrieved from an external API. The data is stored in a **PostgreSQL** database, and the application features an interactive, text-based console interface.

## 🚀 Technologies Used

- **Java JDK**: Version 17 or higher
- **Maven**: Version 4 or higher
- **Spring Boot**: Version 3.2.3
- **PostgreSQL**: Version 16 or higher
- **Jackson**: For JSON processing

## ✨ Features

- Book search using the **Gutendex API** (public domain books).
- Store and manage book data in a **PostgreSQL database**.
- Interactive console-based interface with at least 5 different options, including:
    Search for books
    Filter by author or title
    View book details
    List favorite books
    Delete records
**Detailed information display** about books and authors based on user preferences.

## 🛠️ Prerequisites

Make sure you have the following installed:

- **Java JDK**: Version 17 or higher
- **Maven**: Version 4 or higher
- **PostgreSQL**: Version 16 or higher (configured and running)

## 🔧 Setup and Running Instructions

```bash
1. Clone the repository:

git clone [https://github.com/Angelsoul35/Challenge-LiterAlura-ONE](https://github.com/Angelsoul35/Challenge-LiterAlura-ONE)

2. Navigate to the project directory:

cd Challenge-LiterAlura-ONE

3. Configure the PostgreSQL database:

Create a database named **liter_alura**.
Update the connection settings in the **application.properties** file.
Example:
spring.datasource.url=jdbc:postgresql://localhost:5432/liter_alura
spring.datasource.username=your_username
spring.datasource.password=your_password

4. Build and run the project using Maven:

mvn clean install
mvn spring-boot:run

5. Console Interface:

Follow the prompts in the console to interact with the book catalog.

### 🧪 Testing
To run the unit tests, use the following command:

mvn test

### 🤝 Contributing
Contributions are welcome! If you find any issues or want to add new features, feel free to open an issue or submit a pull request.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

📫 Contact
If you have any questions or suggestions, feel free to reach out:

GitHub: Angelsoul35
Email: [apadillar@ucentral.edu.com](apadillar@ucentral.edu.com)
