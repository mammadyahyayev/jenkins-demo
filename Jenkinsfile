pipeline {
    agent any
    options {
        timeout(time: 2, unit: 'MINUTES')
    }
    stages {
        stage('build') {
            steps {
                script {
                    echo 'Building project...'
                    sh './mvnw clean -Dmaven.test.skip=true package'
                }
            }
        }

        stage('test') {
            steps {
                script {
                    echo 'Executing tests...'
                    sh './mvnw test'
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed. Please check the logs for details.'
            mail bcc: '', body: "<b>Jenkins Demo</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}";
        }
    }
}