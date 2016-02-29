function vowelsAndConsonants(s) {
    
    var i=0;
    while(i<s.length)
        {
            if(s[i]==='a'||s[i]==='e'||s[i]==='i'||s[i]==='o'||s[i]==='u')
                {
                    console.log(s[i]);
                }
            i++;
        }
    i=0;
    while(i<s.length)
        {
            if(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u')
                {
                    console.log(s[i]);
                }
            i++;
        }
}