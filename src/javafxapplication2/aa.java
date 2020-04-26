package javafxapplication2;

<?xml version="1.0" encoding="UTF-8"?>

<??>

<AnchorPane id="AnchorPane" maxHeight="-Infinity" prefHeight="812.0" prefWidth="1100.0" style="-fx-background-color: light blue;" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="StreamApps.TableViewPaneController">
   <children>
      <HBox layoutX="32.0" layoutY="88.0" prefHeight="217.0" prefWidth="515.0" style="-fx-background-color: lightblue;">
         <children>
            <GridPane hgap="3.0" maxHeight="-Infinity" prefHeight="286.0" prefWidth="251.0" vgap="3.0">
              <columnConstraints>
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
              </columnConstraints>
              <rowConstraints>
                <RowConstraints maxHeight="58.0" minHeight="10.0" prefHeight="47.0" vgrow="SOMETIMES" />
                  <RowConstraints maxHeight="70.0" minHeight="10.0" prefHeight="64.0" vgrow="SOMETIMES" />
                <RowConstraints maxHeight="130.0" minHeight="10.0" prefHeight="69.0" vgrow="SOMETIMES" />
                <RowConstraints maxHeight="131.0" minHeight="10.0" prefHeight="67.0" vgrow="SOMETIMES" />
              </rowConstraints>
               <children>
                  <Label maxWidth="-Infinity" style="-fx-font-weight: bold;" text="id" textAlignment="RIGHT" />
                  <Label style="-fx-font-weight: bold;" text="major" GridPane.rowIndex="2" />
                  <Label style="-fx-font-weight: bold;" text="grade" GridPane.rowIndex="3" />
                  <Label style="-fx-font-weight: bold;" text="name" GridPane.rowIndex="1" />
                  <TextField fx:id="TextFieldId" maxWidth="-Infinity" prefHeight="31.0" prefWidth="143.0" GridPane.columnIndex="1" />
                  <TextField fx:id="TextFieldName" prefHeight="35.0" prefWidth="124.0" GridPane.columnIndex="1" GridPane.rowIndex="1" />
                  <TextField fx:id="TextFieldMajor" GridPane.columnIndex="1" GridPane.rowIndex="2" />
                  <TextField fx:id="TextFieldGrade" GridPane.columnIndex="1" GridPane.rowIndex="3" />
               </children>
            </GridPane>
            <TableView fx:id="tableV" prefHeight="217.0" prefWidth="309.0">
              <columns>
                <TableColumn fx:id="coulmnID" prefWidth="100.0" text="id" />
                <TableColumn fx:id="coulmnName" prefWidth="97.0" text="name" />
                  <TableColumn fx:id="coulmnMajor" prefWidth="103.0" text="major" />
                  <TableColumn fx:id="coulmnGrade" prefWidth="88.0" text="grade" />
              </columns>
            </TableView>
         </children>
      </HBox>
      <HBox layoutX="296.0" layoutY="368.0" prefHeight="76.0" prefWidth="554.0" style="-fx-background-color: lightpink;">
         <children>
            <Button fx:id="btnAdd" mnemonicParsing="false" onAction="#buttonAddHandle" style="-fx-background-color: lightblue;" text="AddStu" textAlignment="CENTER">
               <HBox.margin>
                  <Insets left="15.0" right="10.0" top="15.0" />
               </HBox.margin>
            </Button>
            <Button fx:id="showbtn" mnemonicParsing="false" onAction="#buttonShowHandle" style="-fx-background-color: lightblue;" text="show">
               <HBox.margin>
                  <Insets right="15.0" top="15.0" />
               </HBox.margin>
            </Button>
            <Button fx:id="btnEdite" mnemonicParsing="false" onAction="#buttonEditeHandle" style="-fx-background-color: lightblue;" text="Edite">
               <HBox.margin>
                  <Insets right="15.0" top="15.0" />
               </HBox.margin>
            </Button>
            <Button fx:id="btnDelete" mnemonicParsing="false" onAction="#buttonDeleteHandle" style="-fx-background-color: lightblue;" text="Delete">
               <HBox.margin>
                  <Insets right="15.0" top="15.0" />
               </HBox.margin>
            </Button>
            <Button fx:id="btnAddC" mnemonicParsing="false" onAction="#buttonAddCHandle" style="-fx-background-color: lightblue;" text="AddCourse">
               <HBox.margin>
                  <Insets top="15.0" />
               </HBox.margin>
               <padding>
                  <Insets bottom="4.0" left="4.0" right="4.0" top="4.0" />
               </padding>
            </Button>
            <Button fx:id="ShowCourse" mnemonicParsing="false" onAction="#ShowCourseHandle" prefHeight="34.0" prefWidth="113.0" style="-fx-background-color: lightblue;" text="Show Course">
               <HBox.margin>
                  <Insets bottom="30.0" left="15.0" right="30.0" top="15.0" />
               </HBox.margin>
            </Button>
         </children>
      </HBox>
      <TextArea fx:id="Query" layoutX="230.0" layoutY="528.0" prefHeight="107.0" prefWidth="655.0" style="-fx-background-color: lightblue;" />
      <Label layoutX="368.0" layoutY="476.0" text="Write Query to perform it and show result in table view :) " />
      <Button fx:id="performQuery" layoutX="308.0" layoutY="672.0" mnemonicParsing="false" onAction="#PerformBtnHandle" style="-fx-background-color: lightpink;" text="Perform Select Query" textFill="#545452" />
      <Button fx:id="updateDelBtn" layoutX="530.0" layoutY="672.0" mnemonicParsing="false" onAction="#updateDelHandle" style="-fx-background-color: lightpink;" text="Perform Update/Delete Query" />
      <HBox layoutX="565.0" layoutY="87.0" prefHeight="224.0" prefWidth="502.0" style="-fx-background-color: lightblue;">
         <children>
            <GridPane prefHeight="212.0" prefWidth="266.0">
              <columnConstraints>
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
                <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
              </columnConstraints>
              <rowConstraints>
                <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
              </rowConstraints>
               <children>
                  <Label text="ID Student" />
                  <Label text="ID Course" GridPane.rowIndex="1" />
                  <Label text="Smester" GridPane.rowIndex="2" />
                  <TextField fx:id="IdStudent" GridPane.columnIndex="1" />
                  <TextField fx:id="IdCourse" GridPane.columnIndex="1" GridPane.rowIndex="1" />
                  <TextField fx:id="smester" GridPane.columnIndex="1" GridPane.rowIndex="2" />
               </children>
            </GridPane>
            <TableView fx:id="tableCourse" prefHeight="224.0" prefWidth="300.0">
              <columns>
                <TableColumn fx:id="idStdC" prefWidth="90.0" text="ID Student" />
                <TableColumn fx:id="idCourseC" prefWidth="90.0" text="ID Course" />
                  <TableColumn fx:id="smesterC" prefWidth="87.0" text="Smester" />
              </columns>
            </TableView>
         </children>
      </HBox>
   </children>
</AnchorPane>