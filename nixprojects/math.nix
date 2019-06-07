rec {
  abs = x: if x < 0 then x * -1 else x;
  
  # Floor' has this bug:
  # math.floor (-1)   => -1
  # math.floor (-1.0) => -2
  floor' = x: 
    let toInt = str:
      let may_be_int = builtins.fromJSON str; in
      if builtins.isInt may_be_int
        then may_be_int
        else throw "Could not convert ${str} to int."; in 
    if builtins.isInt x 
      then x 
      else 
        let result = toInt 
          (builtins.head (builtins.split "\\." (builtins.toString x))); 
        in if x < 0 then result - 1 else result;
  ceil = x: 1 + (floor' x);

  mod = base: int: base - (int * (builtins.div base int));

  pi = 3.141592653589793;
  e = 2.718281828459045;

  # Random. Once.
  pseudoRand = bound: mod (builtins.currentTime) bound;
  pseudoRandRange = min: max:
    if min >= max
      then throw "max must be greater than min"
      else pseudoRand ((max - min) + 1) + min;

  max = x: y: if x > y then x else y;
  min = x: y: if x > y then y else x;
  pow = x: power: 
    if builtins.isInt power 
      then builtins.foldl' builtins.mul 1 (builtins.genList (val: x) power)
      else throw "Power must be an integer";
#  sqrt = 2;

  
}