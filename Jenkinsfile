pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {
        stage('build') {
            steps {
                echo 'Building project...'
                ./mvnw clean -Dmaven.test.skip=true install
            }
        }

        stage('test') {
            steps {
                echo 'Executing tests...'
                ./mvnw test
            }
        }
    }
}