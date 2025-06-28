/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shopping;


/**
 * Name, ID:-
 * Samar Asiri, 444000717
 * Rema Al-Ghamdi, 444001279
 * Aya Babkoor, 444002180
 * Raghad Al-Subhi, 444003965
 * 
 * Groub: 1
 */


ppackage com.mycompany.shopping;


/**
 * Name, ID:-
 * Samar Asiri, 444000717
 * Rema Al-Ghamdi, 444001279
 * Aya Babkoor, 444002180
 * Raghad Al-Subhi, 444003965
 * 
 * Groub: 1
 */


/**
 * This is the Command interface that defines the basic operations for command objects.
 * It includes methods for executing and undoing commands.
 */
public interface Command {

    /**
     * Executes the command.
     * This method defines the action that will be performed when the command is executed.
     */
    void execute();

    /**
     * Undoes the command.
     * This method reverses the action performed by the execute method.
     */
    void undo();
}