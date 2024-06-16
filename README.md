<h2>Zero-downtime Deployment Test</h2>

--------------------------
- spring boot
- Dockerfile
- docker-compose
- aws ec2
- github action

----------------------------
1. 현 회사에서 배포를 수동으로 진행 중.


2. CI/CD 정도만 해보려고 했으나,<br/>
트래픽이 없는 24-01시 사이에 배포를 하는 <br/>
불편한 프로세스를 갖고 있어 <br/> 
해결해보고자 무중단 배포까지 학습



3. 간단한 테스트는 끝냈으나 회사 프로젝트로 테스트 필요.<br/>
회사 프로젝트에 세션 사용하는 코드들이 있는데 <br/>
무중단 배포 아키텍쳐에서 세션 공유를 어떻게 할지 고민 필요.<br/>
(spring session redis 예정)