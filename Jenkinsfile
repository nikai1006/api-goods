pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'make' // 调用 make 命令
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true  // 匹配并保存文件供以后检索
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                /* `make check` returns non-zero on test failures,
                         * using `true` to allow the Pipeline to continue nonetheless
                         */
                sh 'make check || true'
                junit '**/target/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}