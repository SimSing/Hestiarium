package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import model.Animal;
import model.Animal.Category;
import model.Animal.Occurrence;
import model.Animal.Size;
import model.Animal.Species;


	public class BestiariumController extends service.Lists {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;
	    
	    @FXML
	    private TableView<Animal> animalTableView;
	    
	    @FXML
	    private TableColumn<Animal, String> nameTableColumn;

	    @FXML
	    private TableColumn<Animal, String> categoryTableColumn;

	    @FXML
	    private TableColumn<Animal, String> speciesTableColumn;

	    @FXML
	    private TableColumn<Animal, String> occurrenceTableColumn;

	    @FXML
	    private TableColumn<Animal, String> tagsTableColumn;

	    @FXML
	    private TableColumn<Animal, Number> huntingmodTableColumn;

	    @FXML
	    private TableColumn<Animal, String> sizeTableColumn;

	    @FXML
	    private TableColumn<Animal, String> urlTableColumn;

	    @FXML
	    private ComboBox<Animal.Species> speciesComboBox;

	    @FXML
	    private ComboBox<Animal.Occurrence> occurrenceComboBox;

	    @FXML
	    private ComboBox<Animal.Size> sizeComboBox;

	    @FXML
	    private ComboBox<String> biomeComboBox;
	    
	    @FXML
	    private ComboBox<Animal.Category> categoryComboBox;

	    @FXML
	    private Button resetButton;

	    @FXML
	    private TextField nameTextfield;

	    @FXML
	    void onBiomeComboBoxPressed(ActionEvent event) {
	    	sorting();
	    }

	    @FXML
	    void onCategoryComboBoxPressed(ActionEvent event) {
	    	sorting();
	    }

	    @FXML
	    void onOccurrenceComboBoxPressed(ActionEvent event) {
	    	sorting();
	    }

	    @FXML
	    void onSizeComboBoxPressed(ActionEvent event) {
	    	sorting();
	    }

	    @FXML
	    void onSpeciesComboBoxPressed(ActionEvent event) {
	    	sorting();
	    }
	    
	    @FXML
	    void onResetButtonClicked(ActionEvent event) {
	    	speciesComboBox.getSelectionModel().clearSelection();
	    	occurrenceComboBox.getSelectionModel().clearSelection();
	    	sizeComboBox.getSelectionModel().clearSelection();
	    	categoryComboBox.getSelectionModel().clearSelection();
	    	
	    }
	    
	    @FXML
	    void initialize() {
	        assert nameTableColumn != null : "fx:id=\"nameTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert categoryTableColumn != null : "fx:id=\"categoryTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert speciesTableColumn != null : "fx:id=\"speciesTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert occurrenceTableColumn != null : "fx:id=\"occurrenceTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert tagsTableColumn != null : "fx:id=\"tagsTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert huntingmodTableColumn != null : "fx:id=\"huntingmodTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert sizeTableColumn != null : "fx:id=\"sizeTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert urlTableColumn != null : "fx:id=\"urlTableColumn\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert speciesComboBox != null : "fx:id=\"speciesComboBox\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert occurrenceComboBox != null : "fx:id=\"occurrenceComboBox\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert sizeComboBox != null : "fx:id=\"sizeComboBox\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert biomeComboBox != null : "fx:id=\"biomeComboBox\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert resetButton != null : "fx:id=\"resetButton\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        assert nameTextfield != null : "fx:id=\"nameTextfield\" was not injected: check your FXML file 'Bestiarium.fxml'.";
	        
	        
	        addAnimals(); 
	        
	        
	        animalTableView.setItems(observableAnimalList);
	        System.out.println(animalTableView.getItems());
	        
	        speciesComboBox.getItems().setAll(Species.values());
	        occurrenceComboBox.getItems().setAll(Occurrence.values());
	        occurrenceComboBox.getItems().remove(Occurrence.NORTH_MIDDLE_AVENTURIA);
	        occurrenceComboBox.getItems().remove(Occurrence.SOUTH_MIDDLE_AVENTURIA);
	        sizeComboBox.getItems().setAll(Size.values());
	        categoryComboBox.getItems().setAll(Category.values());
	        
	        biomeComboBox.getItems().add("Wald");
	        biomeComboBox.getItems().add("Waldrand");
	        biomeComboBox.getItems().add("Steppe");
	        biomeComboBox.getItems().add("Gebirge");
	        biomeComboBox.getItems().add("Wüste");
	        biomeComboBox.getItems().add("Höhle");
	        biomeComboBox.getItems().add("Fluss");
	        biomeComboBox.getItems().add("See");
	        biomeComboBox.getItems().add("Meer");
	        biomeComboBox.getItems().add("Küste");
	        biomeComboBox.getItems().add("Strand");
	        biomeComboBox.getItems().add("Sumpf");
	        biomeComboBox.getItems().add("Dschungel");
	        biomeComboBox.getItems().add("Maraskan");
	        biomeComboBox.getItems().add("Farm");
	        biomeComboBox.getItems().add("Zucht");
	        biomeComboBox.getItems().add("Pet");
	        
	        
	        nameTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
	        categoryTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCategory().toString()));
	        speciesTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSpecies().toString()));
	        occurrenceTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getOccurrence().toString()));
	        tagsTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getBiome()));
	        huntingmodTableColumn.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getHuntingModifier()));
	        sizeTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSize().toString()));
	        urlTableColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUrlPath()));
	        
	       var linkCallBack = new Callback<TableColumn<Animal, String>, TableCell<Animal, String>>() {
	        	 
	            @Override
	            public TableCell<Animal, String> call(TableColumn<Animal, String> arg) {
	                TableCell<Animal, String> cell = new TableCell<Animal, String>() {
	                	
	                	Button link = new Button("Link");
	                	
	                    
	                    public void updateItem(String item, boolean empty) {
	                    	super.updateItem(item, empty);
	                    	
	                    	
	                    	if (empty) {
	                    		setGraphic(null);
	                    		setText(null);
	                    	}else {
	                    	link.setOnAction(e -> {
	                    		String url = animalTableView.getItems().get(getIndex()).getUrlPath();
	                    		System.out.println("Test");
	                    		Runtime runtime = Runtime.getRuntime();
	                    		try {
									runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
	                    		
	                    		
	                    		
	                    	});
	                    	setGraphic(link);
	                    	}
	                    }
	                };
	                return cell;
	            }
	        };
	      ;;
	      urlTableColumn.setCellFactory(linkCallBack);
	    }
	    void filterSpecies(String species) {
	    	FilteredList<Animal> bestiariumSpecies = new FilteredList<>(animalTableView.getItems());
	    	Predicate<Animal> speciesPredicator = i -> i.getSpecies().toString() == species;
	    	bestiariumSpecies.setPredicate(speciesPredicator);
	    	animalTableView.setItems(bestiariumSpecies);
	    }
	    
	    void filterOccurrence (String occurrence) {
	    	FilteredList<Animal> bestiariumOccurrence = new FilteredList<>(animalTableView.getItems());
	    	Predicate<Animal> occcurrencePredicator = i ->i.getOccurrence().toString().contains(occurrence.substring(0, 5)) | i.getOccurrence().toString() == "EVERYWHERE";
	    	bestiariumOccurrence.setPredicate(occcurrencePredicator);
	    	animalTableView.setItems(bestiariumOccurrence);
	    }
	    
	    void filterSize (String size) {
	    	FilteredList<Animal> bestiariumSize = new FilteredList<>(animalTableView.getItems());
	    	Predicate<Animal> sizePredicator = i -> i.getSize().toString() == size;
	    	bestiariumSize.setPredicate(sizePredicator);
	    	animalTableView.setItems(bestiariumSize);
	    }
	    
	    void filterCategory (String category) {
	    	FilteredList<Animal> bestiariumCategory = new FilteredList<>(animalTableView.getItems());
	    	Predicate<Animal> categoryPredicator = i -> i.getCategory().toString().contains(category);
	    	bestiariumCategory.setPredicate(categoryPredicator);
	    	animalTableView.setItems(bestiariumCategory);
	    }
	    
	    void filterBiome (String biome) {
	    	FilteredList<Animal> bestiariumBiome = new FilteredList<>(animalTableView.getItems());
	    	Predicate<Animal> biomePredicator = i -> i.getBiome().contains(biome);
	    	bestiariumBiome.setPredicate(biomePredicator);
	    	animalTableView.setItems(bestiariumBiome);
	    }
	    
	    void printList() {
	    	System.out.println(observableAnimalList);
	    }
	    void sorting() {
	    	animalTableView.setItems(observableAnimalList);
	    	
	    	if (!speciesComboBox.getSelectionModel().isEmpty()) {
	    		filterSpecies(speciesComboBox.getSelectionModel().getSelectedItem().toString());
	    	}
	    	if (!occurrenceComboBox.getSelectionModel().isEmpty()) {
	    		filterOccurrence(occurrenceComboBox.getSelectionModel().getSelectedItem().toString());
	    	}
	    	if (!sizeComboBox.getSelectionModel().isEmpty()) {
	    		filterSize(sizeComboBox.getSelectionModel().getSelectedItem().toString());
	    	}
	    	if (!categoryComboBox.getSelectionModel().isEmpty()) {
	    		filterCategory(categoryComboBox.getSelectionModel().getSelectedItem().toString());
	    	}
	    	if (!biomeComboBox.getSelectionModel().isEmpty()) {
	    		filterBiome(biomeComboBox.getSelectionModel().getSelectedItem());
	    	}
	    }
	}



