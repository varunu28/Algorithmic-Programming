#include <iostream>
#include <string>

using namespace std;

inline
void use_io_optimizations()
{
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
}

int main()
{
    use_io_optimizations();

    int age;
    int standard;

    string first_name;
    string last_name;

    cin >> age >> first_name >> last_name >> standard;

    cout << age        << '\n'
         << last_name  << ", "
         << first_name << '\n'
         << standard   << '\n';

    cout << '\n';

    cout << age        << ','
         << first_name << ','
         << last_name  << ','
         << standard   << '\n';

    return 0;
}