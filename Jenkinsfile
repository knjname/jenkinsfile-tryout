pipeline {
    
    agent {
        docker {
            image 'maven:3.3.3'
            label 'docker'
        }
    }

    stages {
        stage("build") {
            steps {
                [1,2,3,].each { sh 'mvn --version' }
            }
        }
    }
}
