package model;

public class User implements Validate {

    private int id = 1000;
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.id++;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean validate() {
        if (username == null || username.trim().length() < 6){
            return false;
        }

        if (password == null || password.length() < 8){
            return false;
        }

        boolean hasBigLetter = false;
        boolean hasNumberOrSymbol = false;

        for (char symbol : password.toCharArray()){
            if(Character.isUpperCase(symbol)){
                hasNumberOrSymbol = true;
            }
            if(Character.isDigit(symbol) || !Character.isLetterOrDigit(symbol)){
                hasNumberOrSymbol = true;
            }
        }
        return hasNumberOrSymbol && hasBigLetter;
    }
}
