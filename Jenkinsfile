pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'SECONDS')
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
        }
    }
}