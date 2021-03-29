# railFence
Description:

A command line menu-driven Java application capable of encrypting or decrypting a short message or file using a Rail Fence Cypher. 
A Rail Fence Cypher is a transposition cypher that creates an n x k matrix of characters to encrypt plaintext
(n is the length of the plaintext and k is the key). 
The plaintext characters are then written into the matrix in a zigzag pattern. The cypher text is created by appending the character set in each row to a string.
Decryption involves the transposition being undone.

Features:

* Allows the user to enter the rail fence key and change the starting row for encryption/decryption
* Uses a 2D array to implement the cypher
* Tests the speed of the implementation
* Exception Handling if a null or invalid key is entered
* Exception Handling added to Rail Fence Cypher
* I/O features including inputStream use, output stream
