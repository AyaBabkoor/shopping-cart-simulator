/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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


import java.util.Stack;

/**
 * This class is responsible for managing and executing commands.
 * It keeps track of executed commands and allows for undoing the most recent command.
 */
public class CommandManager {

    /**
     * A stack that holds the history of executed commands.
     * The stack allows for easy undoing of the last command.
     */
    private Stack<Command> commandHistory = new Stack<>();

    /**
     * Executes a given command and stores it in the command history.
     * 
     * @param command The command to be executed.
     */
    public void executeCommand(Command command) {
        command.execute(); // Executes the command
        commandHistory.push(command); // Pushes the command onto the stack to keep track of it
    }

    /**
     * Undoes the last executed command by popping it from the stack and calling its undo method.
     * If there are no commands in history, nothing happens.
     */
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) { // Check if there are any commands to undo
            commandHistory.pop().undo(); // Pops the last command from the stack and undoes it
        }
    }
}