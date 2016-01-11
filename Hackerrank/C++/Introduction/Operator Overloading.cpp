class Matrix{
public:
	vector<vector<int> >a;
	Matrix(){}
	Matrix(const Matrix &o):a(o.a){}
	Matrix& operator +=(const Matrix &o){
		for(int y=0;y<a.size();y++)for(int x=0;x<a[y].size();x++)a[y][x]+=o.a[y][x];
		return *this;
	}
	Matrix operator +(const Matrix &o){
		return Matrix(*this)+=o;
	}
};