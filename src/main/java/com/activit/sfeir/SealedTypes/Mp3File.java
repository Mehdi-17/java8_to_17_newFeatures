package com.activit.sfeir.SealedTypes;

//When we extend a sealed class, children have to add keyword sealed, non-sealed or final
public sealed class Mp3File extends AudioFile permits ExtendedMp3File {
}
