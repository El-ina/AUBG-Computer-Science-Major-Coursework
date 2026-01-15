#include <iostream>

#include "Book.h"
#include "Book.cpp"
#include "ChildrenBook.h"
#include "ChildrenBook.cpp"
#include "SeriousBook.h"
#include "SeriousBook.cpp"
using namespace std;

// The test driver is an application which lets users enter n children's books or serious books
// (n to be provided by the user)
// Keep the books in an array
// Print the breakdown of the whole book collection - the type of the book at each position
// Finally, say the count of valid books in the book collection

bool validityChecker(Book* b)
{
    if (b->getName() == "INVALID" || b->getAuthor() == "INVALID" || b->getPages() < 0)
    {
        return false;
    }
    return true;
}

int main()
{
    // Book book("name", "author", 21); - This doesn't work because Book contains an abstract method

    int n;
    cout << "Enter the number of books: ";
    cin >> n;
    cin.ignore();

    Book* books[n];

    int valids = 0;

    for (int i = 0; i < n; i++)
    {
        cout << "Enter the book name (ending with *): ";
        string name;
        getline(cin, name, '*');
        cin.ignore();

        cout << "Enter the author name (ending with *): ";
        string author;
        getline(cin, author, '*');
        cin.ignore();

        cout << "Enter the pages: ";
        int pages;
        cin >> pages;
        cin.ignore();

        cout << "Is it a children's book (y/n)? ";
        char isChildrens;
        cin >> isChildrens;
        cin.ignore();

        if (tolower(isChildrens) == 'y')
        {
            cout << "Enter the book's appropriate age: ";
            int appropriateAge;
            cin >> appropriateAge;
            cin.ignore();

            Book* book = new ChildrenBook(name, author, pages, appropriateAge);
            books[i] = book;

            if (validityChecker(book) && appropriateAge > 0)
            {
                valids++;
            }
        }
        else if (tolower(isChildrens) == 'n')
        {
            cout << "Enter the book's genre (ending with *): ";
            string genre;
            getline(cin, genre, '*');
            cin.ignore();

            Book* book = new SeriousBook(name, author, pages, genre);
            books[i] = book;

            if (validityChecker(book) && genre != "INVALID")
            {
                valids++;
            }
        }

        cout << endl;
    }

    cout << endl << "Book Collection Breakdown: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << i + 1 << ". ";
        books[i]->type();

        delete books[i];
    }

    cout << endl << "Valid books count: " << valids << endl;

    return 0;
}