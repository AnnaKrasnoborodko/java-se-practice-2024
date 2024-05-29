/* Abstract Class
Create an abstract class to define items that can be stored in a tree.
Implement the following:
1.  ListItem (abstract class)
    -  It has three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.
    -  A constructor that takes an Object and initialises the field value with the parameter that was passed in.
    -  And seven methods:
        -  next(), setNext(), previous(), setPrevious() and compareTo() which are package-private and abstract (see child class for declaration).
        -  getValue(), takes no parameters and returns its value.
        -  setValue(), takes an Object and assigns it to value.
       
2.  Node (concrete class)
    -  It extends ListItem.
    -  It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
    -  And five methods which are package-private:
        -  next(), takes no parameters and returns the ListItem to its right.
        -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
        -  previous(), takes no parameters and returns the ListItem to its left.
        -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
        -  compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison. If this value is greater than the value that was passed in, then it should return a number greater than zero. If vice versa, then it should return a number less than zero, and zero if equal.
3.  MyLinkedList (concrete class)
    -  It implements NodeList.
    -  It has one field of type ListItem called root.
    -  A constructor that takes a ListItem and initializes the field root with the newly passed in parameter.
    -  And four methods:
        -  getRoot(), getter for root.
        -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise. If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
        -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
        -  traverse(), takes the root as an argument and does not return anything. If the root is null it prints out: The list is empty, otherwise print each value on a separate line.
4.  NodeList (interface)
    -  It has four methods:
        -  getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).
5.  SearchTree (concrete class)
    -  It implements NodeList.
    -  It has one field of type ListItem called root.
    -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
    -  And five methods:
        -  getRoot(), getter for root.
        -  addItem(), same as MyLinkedList.
        -  removeItem(), same as MyLinkedList.
        -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.
        -  traverse(), takes the root as an argument and does not return anything. It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.
TIP:  The rules for adding an item to the linked tree are: 
          If the head of the tree is null, make the head refer to the item to be added.
          If the item to be added is less than the current item in the tree, add the item before the current item (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
          If the item to be added is greater than the current item, move onto the next item and compare again (if there is no next item, then that is where the new item belongs).
TIP:  When adding items to a Binary Search Tree, if the item to be added is less than the current item - then move to the left.
         If it is greater than the current item - then move to the right.
         The new item is added when an attempt to move in the required direction would involve following a null reference.
         Once again, duplicates are not allowed.
TIP:  Inorder = print the previous node, then the parent node, and then the next node (left -> node -> right).*/
package pl.globallogic.exercises.exercise46;

import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch checkedBranch : branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer branchCustomer : branchCustomers) {
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (branchCustomers.indexOf(branchCustomer) + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (Double transaction : transactions) {
                        System.out.println("[" + (transactions.indexOf(transaction) + 1) + "]  Amount " + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer checkedCustomer : customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}

public class Banking {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}