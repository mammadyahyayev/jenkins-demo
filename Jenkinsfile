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
            emailext(
                subject: "Build failed in Jenkins: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
                body: "Hello,\n\nThe build has failed.\n\nJob: ${env.JOB_NAME}\nBuild Number: ${env.BUILD_NUMBER}\n\nPlease check the Jenkins console output for more details.",
                recipientProviders: [[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']]
            )
        }
    }
}