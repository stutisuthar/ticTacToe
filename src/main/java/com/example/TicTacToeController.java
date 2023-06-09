package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tictactoe")
public class TicTacToeController {
    private TicTacToe ticTacToe;

    public TicTacToeController() {
        ticTacToe = new TicTacToe();
    }

    @GetMapping("/board")
    public char[][] getBoard() {
        return ticTacToe.getBoard();
    }

    @PostMapping("/move")
    public void makeMove(@RequestParam int row, @RequestParam int col) {
        ticTacToe.makeMove(row, col);
    }

    // Add more API endpoints for checking game status, resetting the game, etc.
}
