with builtins; rec {

  stream = f: { stream = f; };

  # On average, max size is just over 18000
  take = n: stream: 
    if n == 0 then []
    else (take (n - 1) stream) ++ [(stream.stream n)];
  
  

}
