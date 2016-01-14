template <typename T>
class AddElements
{
public:

    AddElements(const T& element):
        element {element}
    { }

    T add(const T& other)
    {
        return element + other;
    }

private:

    T element;
};

template <>
class AddElements<string>
{
public:

    AddElements(const string& element):
        element {element}
    { }

    string concatenate(const string& other)
    {
        return element + other;
    }

private:

    string element;
};