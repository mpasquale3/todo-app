pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'todo-app:latest'  // Fix: Added 'latest' tag
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/mpasquale3/todo-app.git'
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %DOCKER_IMAGE% .' // Fix: Use Windows batch variable syntax
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8081:8080 todo-app:latest'

            }
        }
    }
}
