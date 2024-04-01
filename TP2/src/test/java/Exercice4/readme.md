# Exercice 4 : Jeu de dés
### 1. Mocking Dependencies for Testing jouer:
To automate the testing of the jouer method in the Jeu class, certain dependencies need to be mocked. These dependencies include objects that represent external entities such as the player (Joueur), dice (De), and bank (Banque). These interfaces will be mocked in the test environment to simulate their behavior during gameplay.
### 2. Scenarios for Testing jouer:
To thoroughly test the jouer method, various scenarios or equivalence classes need to be considered. These scenarios include:

* **Player Wins:** The sum of dice rolls is 7, and the player wins.
* **Player Loses:** The sum of dice rolls is not 7, and the player loses.
* **Player is Insolvent:** The player does not have enough funds to place a bet.
* **Bank Becomes Insolvent:** The bank cannot afford to pay out winnings.
* **Game is Closed:** The game is closed due to excessive winnings or insolvency.
### 3. Java Code for Jeu Class:
Below is the Java code for the Jeu class, implementing the required functionality for the game:
```java
import java.util.Random;

public class Jeu {
    private Banque banque;

    public Jeu(Banque labanque) {
        this.banque = labanque;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if (!estOuvert()) {
            throw new JeuFermeException("Le jeu est fermé.");
        }

        int mise = joueur.mise();

        try {
            joueur.debiter(mise);
            int result = de1.lancer() + de2.lancer();

            if (result == 7) {
                joueur.crediter(mise * 2);
            } else {
                // Player loses
            }
        } catch (DebitImpossibleException e) {
            // Player is insolvent
            throw new JeuFermeException("Le joueur est insolvable.");
        }

        if (!banque.est_solvable()) {
            throw new JeuFermeException("La banque n'est plus solvable.");
        }
    }

    public void fermer() {
        
    }

    public boolean estOuvert() {
        return true;
    }
}

```
### 4. Testing Game Closure:
test case: Because attention is directed towards the result.
### 5. Testing Player Insolvency:
In this test case, we simulate a scenario where the player is insolvent. To ensure that the game does not interfere with the dice, stubs for the De interface methods can be used to simulate dice rolls. This test is focused on checking the state of the game when the player is unable to place a bet
### 6. Continuing with Other Scenarios:
Following the initial tests, further scenarios such as player wins, player losses, and bank insolvency will be tested. Each scenario will have its own set of assertions to verify the behavior of the jouer method under different conditions.
### 7. Implementing Bank and Rewriting Test:
An implementation for the bank interface will be provided, including methods for crediting, debiting, and checking solvency. One of the existing tests involving the bank will be rewritten to integrate this implementation. A comparison between the two tests will be made to understand the differences in testing approach and outcomes.
