/*
 * File Name:               mystring_B.h
 * Course:                  ENSF 614 - Fall 2021
 * Lab # and Assignment #:  Lab 6 Exercise B
 * Lab section:             B01
 * Completed by:            Bhavyai Gupta
 * Submission Date:         November 16, 2021
 */

#include <iostream>
#include <string>
using namespace std;

#ifndef MYSTRING_H
#define MYSTRING_H

class Mystring
{
public:
    Mystring();
    // PROMISES: Empty string object is created.

    Mystring(int n);
    // PROMISES: Creates an empty string with a total capacity of n.
    //           In other words, dynamically allocates n elements for
    //           charsM,sets the lengthM to zero, and fills the first
    //           element of charsM with '\0'.

    Mystring(const char *s);
    // REQUIRES: s points to first char of a built-in string.
    // REQUIRES: Mystring object is created by copying chars from s.

    ~Mystring(); // destructor

    Mystring(const Mystring &source); // copy constructor

    Mystring &operator=(const Mystring &rhs); // assignment operator
    // REQUIRES: rhs is reference to a Mystring as a source
    // PROMISES: to make this-object (object that this is pointing to, as a copy
    //           of rhs.

    bool operator==(const Mystring &rhs) const; // is equal to operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically equal to rhs, otherwise false

    bool operator!=(const Mystring &rhs) const; // not equal to operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically not equal to rhs, otherwise false

    bool operator>(const Mystring &rhs) const; // greater than operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically greater than rhs, otherwise false

    bool operator>=(const Mystring &rhs) const; // greater than or equal to operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically greater than or equal to rhs, otherwise false

    bool operator<(const Mystring &rhs) const; // less than operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically less than rhs, otherwise false

    bool operator<=(const Mystring &rhs) const; // less than or equal to operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: returns true if this object is lexicographically less than or equal to rhs, otherwise false

    char &operator[](int i) const;
    //  REQUIRES: 0 <= i <= lengthM
    //  PROMISES: returns the character at index i of string charsM

    friend ostream &operator<<(ostream &os, const Mystring &rhs); // insertion operator
    //  REQUIRES: rhs is reference to a Mystring as a source
    //  PROMISES: prints the charsM to the stdout

    int length() const;
    // PROMISES: Return value is number of chars in charsM.

    char get_char(int pos) const;
    // REQUIRES: pos >= 0 && pos < length()
    // PROMISES:
    // Return value is char at position pos.
    // (The first char in the charsM is at position 0.)

    const char *c_str() const;
    // PROMISES:
    //   Return value points to first char in built-in string
    //   containing the chars of the string object.

    void set_char(int pos, char c);
    // REQUIRES: pos >= 0 && pos < length(), c != '\0'
    // PROMISES: Character at position pos is set equal to c.

    Mystring &append(const Mystring &other);
    // PROMISES: extends the size of charsM to allow concatenate other.charsM to
    //           to the end of charsM. For example if charsM points to "ABC", and
    //          other.charsM points to XYZ, extends charsM to "ABCXYZ".
    //

    void set_str(char *s);
    // REQUIRES: s is a valid C++ string of characters (a built-in string)
    // PROMISES:copys s into charsM, if the length of s is less than or equal lengthM.
    //          Othrewise, extends the size of the charsM to s.lengthM+1, and copies
    //          s into the charsM.

private:
    int lengthM;  // the string length - number of characters excluding \0
    char *charsM; // a pointer to the beginning of an array of characters, allocated dynamically.
    void memory_check(char *s);
    // PROMISES: if s points to NULL terminates the program.
};
#endif
