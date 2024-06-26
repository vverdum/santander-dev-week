package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_user") // Cria uma tabela de banco de dados para o usuario

    public class User {

        @Id // Define o parametro de identidade
        @GeneratedValue(strategy = GenerationType.IDENTITY)//gera o id automaticamente
        private Long id;

        private String name;

        @OneToOne(cascade = CascadeType.ALL)// relacionamento forte, quando o usuario for deletado, sua conta sera deletada junto
        private Account account;

        @OneToOne(cascade = CascadeType.ALL)
        private Card card;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)// quando selecionar o usuario suas features serão automaticamente relacionadas
        private List<Feature> features;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        private List<News> news;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public Card getCard() {
            return card;
        }

        public void setCard(Card card) {
            this.card = card;
        }

        public List<Feature> getFeatures() {
            return features;
        }

        public void setFeatures(List<Feature> features) {
            this.features = features;
        }

        public List<News> getNews() {
            return news;
        }

        public void setNews(List<News> news) {
            this.news = news;
        }

    }

