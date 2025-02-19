pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'todo-app'
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
                bat 'docker build -t ${DOCKER_IMAGE} .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8080:8080 ${DOCKER_IMAGE}'
            }
        }
    }
}
