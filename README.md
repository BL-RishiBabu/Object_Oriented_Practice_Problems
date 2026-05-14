# Object Oriented Practice Problems

## Overview

This repository contains solutions for a set of object-oriented programming practice problems. The focus is on designing classes, managing object relationships, and implementing core program logic for stock account management, account debit validation, commercial stock processing, and card deck handling.

## Problem Statements

### 1. Stock Account Management
- Read multiple stocks from input.
- For each stock, capture:
  - Stock name
  - Number of shares
  - Share price
- Calculate the value of each stock and the total value of all stocks.
- Print a stock report showing:
  - Stock name
  - Number of shares
  - Share price
  - Total value per stock
  - Total value of the stock portfolio

**Implementation hints:**
- Create a `Stock` class for individual stocks.
- Create a `StockPortfolio` class to hold a collection of `Stock` objects.
- Add methods to calculate individual stock value and total portfolio value.

### 2. Account Debit Method
- Modify the `Account` class to provide a `debit` method.
- The `debit` method should withdraw money only if the requested amount does not exceed the account balance.
- If the debit amount exceeds the balance:
  - Do not change the balance
  - Print: `Debit amount exceeded account balance`
- Modify `AccountTest` to verify the behavior of the `debit` method.

### 3. Commercial Data Processing with StockAccount
- Implement `StockAccount.java` to represent customer stock account information.
- Maintain a list of `CompanyShares` objects.
- Each `CompanyShares` object should include:
  - Stock symbol
  - Number of shares
  - Transaction date/time
- When a buy or sell operation is initiated:
  - Check whether the requested company shares already exist
  - Update the existing record or create a new one accordingly

### 4. DeckOfCards Program
- Initialize a deck of 52 cards with:
  - Suits: `Clubs`, `Diamonds`, `Hearts`, `Spades`
  - Ranks: `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `Jack`, `Queen`, `King`, `Ace`
- Shuffle the deck using a random method.
- Distribute 9 cards to 4 players.
- Print the cards received by each player using a 2D array.

### 5. Extended Card Player Program
- Extend the deck-of-cards solution with a `Player` object.
- Each player should maintain a deck of cards.
- Add the ability to sort cards by rank.
- Store player cards in a queue implemented using a linked list.
- Do not use any collection library for queue or card storage.
- Arrange players in a queue as well.
- Print each player and the cards they receive.

## Notes
- Use object-oriented principles for class design and encapsulation.
- Avoid built-in collection libraries where specified.
- Keep the README clear and easy to read for reviewers and future maintainers.
