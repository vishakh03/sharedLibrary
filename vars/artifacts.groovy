def call(string artifacts) {
  archiveArtifacts artifacts: 'publish/**', fingerprint: true
}
