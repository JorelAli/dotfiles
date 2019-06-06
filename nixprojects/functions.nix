let 

  mod = import ./mod.nix;
  isPrime = import ./isPrime.nix;

in {
  inherit mod isPrime;
}
