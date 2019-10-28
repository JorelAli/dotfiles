with import <nixpkgs> {};
stdenv.mkDerivation {
  name = "someNameHere";
  buildInputs = [];
  shellHook = ''
    export MYVAR=${somePackage/lib}
    other various commands
  '';
}
