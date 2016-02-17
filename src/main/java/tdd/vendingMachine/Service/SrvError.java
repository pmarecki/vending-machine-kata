package tdd.vendingMachine.Service;

/**
 * Service layer error conditions
 */
public enum SrvError {
    TRANSACTION_IN_PROGRESS,
    NOMINALS_NOT_DIVISIBLE_BY_DMONEY,
    SUM_NOT_DIVISIBLE_BY_DMONEY,
    SELECTING_EMPTY_SHELF,
    CANT_INSERT_COINS_BEFORE_SELECTING_PRODUCT,
    CANT_PAY_CHANGE,
    CANT_COMMIT_WHILE_NOT_READY
}
