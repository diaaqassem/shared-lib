package org.iti;

def dockerBuild(String imageName, String buildNumber) {
        sh "docker build -t ${imageName}:v${buildNumber} ."
        sh "docker images"
        sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}
