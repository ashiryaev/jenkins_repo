m_1
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Hello2') {
            steps {
                echo 'Hello World22'
            }
        }
    }
}

f1_1
f1_2