Feature: Checkout

  Scenario: make 1 transaction until checkout
    Given Login
    When choose product
    When choose courier
    And choose voucher
    Then choose payment

