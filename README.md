# Cities-API :city_sunrise:

### API Rest de consulta de cidades do Brasil. 

A API visa calcular a distância entre as cidades e encontrá-las pelo calculo do raio. Desafio de projeto proposto pela **Digital Inovation One** através do Bootcamp da **TQI**.



### Requisitos

- Git
- Java 11
- IntelliJ Community
- Postman
- Heroku CLI
- Postgres

Foi obtido através do seguinte repositório https://github.com/chinnonsantos/sql-paises-estados-cidades, o SQL de todos os **Países e Nações** (c/ Código do Portal do Comércio Exterior ou BACEN) + **Estados e Federações Brasileiras** (c/ DDD e Código do IBGE) + **Cidades e Municípios Brasileiros** (c/ Código do IBGE), incluindo as 31 regiões administrativas do DF, Ilhas e Áreas Remotas do Mundo.



### Considerações

Na criação dessa API não utilizei Docker pois preferi utilizar o Postgres instalado no notebook. Foi feito em Gradle , o que  exigiu a instalação das seguintes dependências:

dependencies {

	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'com.vladmihalcea:hibernate-types-52:2.9.8'
	implementation 'org.postgresql:postgresql'
	testImplementation('org.springframework.boot:spring-boot-starter-test'){
		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
	}
  
	testImplementation 'com.h2database:h2:1.4.200'
}

No geral foi um projeto executado de maneira tranquila que permitiu obter uma boa compreensão na criação da API.
Quero agradecer ao professor André Luis https://github.com/andrelugomes pela condução nas orientações para criação desse projeto.
