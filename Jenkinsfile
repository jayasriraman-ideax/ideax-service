pipeline {
    agent any

    stages {

        stage('Build Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8443:8443 springboot-app || true'
            }
        }
    }
}