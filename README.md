# 🚀 Fastrack Web Application

**Fastrack** is a simple and fast JSP-based web application built using **Maven**, **Apache Tomcat**, and deployed on **AWS EC2**.  
It provides a basic user authentication flow with login, registration, and dashboard pages — ideal for learning full-stack Java web development and deployment.

---

## 🌟 Features

- 🧾 **User Authentication** – Login and Registration pages using JSP and Servlets  
- 💻 **Dashboard** – Displays user information post-login  
- ⚙️ **Maven Build** – Automated project build and dependency management  
- ☁️ **AWS EC2 Deployment** – Easily deployable to cloud for live hosting  
- 🧱 **Tomcat Integration** – WAR file deployable on any Tomcat server  
- 🧩 **Clean MVC Architecture** – JSP (View) + Servlet (Controller) + Java (Model)

---

## 🏗️ Tech Stack

| Component | Technology Used |
|------------|----------------|
| Backend | Java Servlets, JSP |
| Build Tool | Maven |
| Server | Apache Tomcat 9+ |
| Deployment | AWS EC2 |
| Frontend | HTML, CSS (inside JSP pages) |

---

## 📁 Project Structure
fastrack/
│
├── pom.xml
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/fastrack/servlets/LoginServlet.java
│ │ ├── webapp/
│ │ │ ├── WEB-INF/web.xml
│ │ │ ├── login.jsp
│ │ │ ├── register.jsp
│ │ │ └── dashboard.jsp
└── target/
└── fastracks.war

1️⃣ Build the Project
```bash
mvn clean package

2️⃣ Deploy WAR File to Tomcat
Copy the generated WAR file from target/fastracks.war to your Tomcat’s webapps folder.

3️⃣ Start Tomcat Server
cd apache-tomcat-9.0.x/bin
./startup.sh     # (Linux/Mac)
startup.bat      # (Windows)

4️⃣ Access the Application
Open your browser and visit:
http://localhost:8080/fastracks/

Default login:
Username: admin
Password: admin

☁️AWS EC2 Deployment (Optional)

Launch an Ubuntu EC2 instance
Install Java and Tomcat:

sudo apt update
sudo apt install openjdk-11-jdk -y
wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.xx/bin/apache-tomcat-9.0.xx.tar.gz
tar -xvzf apache-tomcat-9.0.xx.tar.gz

Copy WAR file to Tomcat webapps:
sudo cp fastracks.war /opt/tomcat/webapps/

Start Tomcat:
./startup.sh

Access your app using your EC2 public IP:
http://<EC2-Public-IP>:8080/fastracks/











