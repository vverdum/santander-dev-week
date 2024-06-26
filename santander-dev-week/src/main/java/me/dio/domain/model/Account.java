package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // o número da conta é unico
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    /* A anotação @Column é usada para fornecer informações sobre como essa propriedade
    deve ser mapeada para a coluna correspondente no banco de dados.
    - precision = 2 indica que o número total de dígitos que podem ser armazenados
    no banco de dados será de até 2 dígitos.
    - scale = 13 indica que até 13 desses dígitos podem ser colocados após o ponto decimal.
     */

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}