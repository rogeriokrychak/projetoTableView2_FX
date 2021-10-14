package com.example.projetotableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class tableController implements Initializable{
    @FXML
    private TableView<Pessoas> table;

    @FXML
    private TableColumn<Pessoas, Integer> id;

    @FXML
    private TableColumn<Pessoas, String> nome;

    @FXML
    private TableColumn<Pessoas, String> sobrenome;

    @FXML
    private TableColumn<Pessoas, String> gmail;

    @FXML
    private TableColumn<Pessoas, String> yahoo;

    @FXML
    private TableColumn<Pessoas, String> telefone;

    @FXML
    private TableColumn<Pessoas, String> pais;


    @FXML
    ObservableList<Pessoas> list = FXCollections.observableArrayList(
            new Pessoas(1,"Rogerio","Krychak","roger.krychak@gmail.com","mail@yahoo.com","4198067676","Brasil"),
            new Pessoas(2,"Adelton","Caetano","adelton.caetano@gmail.com","b@yahoo.com","4198099000","Brasil"),
            new Pessoas(3,"Mari","Gimenez","mari.gimenez@gmail.com","c@yahoo.com","4198061111","Brasil"),
            new Pessoas(4,"Adriano","Luiz","adriano.luiz@gmail.com","d@yahoo.com","4198062222","Brasil"),
            new Pessoas(5,"Gilberto","Rocha","gilberto.rocha@gmail.com","e@yahoo.com","4198063333","Brasil")
    );

        @FXML
        public void initialize(URL url, ResourceBundle rb) {

        id.setCellValueFactory (new PropertyValueFactory<Pessoas, Integer>("id"));
        nome.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("nome"));
        sobrenome.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("sobrenome"));
        gmail.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("gmail"));
        yahoo.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("yahoo"));
        telefone.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("telefone"));
        pais.setCellValueFactory(new PropertyValueFactory<Pessoas, String>("pais"));

        table.setItems(list);
    }




}
