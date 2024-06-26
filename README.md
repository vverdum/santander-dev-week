# Santander Dev Week
RESTful API da Santander Dev Week construída em Java 17 com Spring Boot 3.
```mermaid

classDiagram
    class Usuario {
        - String name
        - Conta account
        - Cartao card
        - List<Feature> features
        - List<News> news
    }
    
    class Conta {
        - String number
        - String agency
        - float balance
        - float limit
    }
    
    class Cartao {
        - String number
        - float limit
    }
    
    class Feature {
        - String icon
        - String description
    }
    
    class News {
        - String icon
        - String description
    }

    Usuario "1" *-- "1" Conta
    Usuario "1" *-- "N" Cartao
    Usuario "1" *-- "1" Feature : contains
    Usuario "1" *-- "N" News : contains
```
