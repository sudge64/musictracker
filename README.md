# musictracker
A music tracker originally made for a school project.
# Project Vision - Music Tracker

## System Description

This system's end goal is be a music tracker, a digital audio workstation with no need for physical instruments. The system would contain code for the user interface, the sample creation suite, sound generation, and playback of previously programmed music tracks. It is intended to be released as a desktop program for end users, without any need to sign into a server in the cloud, for the purpose of creating music.

## Main System Functionality

It is my goal that the tracker will feature the following capabilities.

It will enable the user to create samples with sine, triangle, and square waves using built-in tools. The user will be able to adjust the waveforms to create the sounds of their choice. This feature is rather necessary, as without it, there is no use for the program.

The playback and manipulation of digitally recorded sounds is paramount. A large selling point of trackers in the past was their ability to take a recording of an instrument and enable the user to perform the same actions on them as the digitally created sounds. This will require the system to be able to access the host machine's sound hardware for recording the instrument.

The system must have the ability to export music made in the program with .xm and .mod file extensions. These are quite old file extensions that gained popularity with the first trackers to come to market. Using them will enable compatibility with trackers for modern computers as well as classic models, such as the Amiga line from Commodore.

A sensible, straightforward user interface is a dominant goal. Many previous trackers have visual design paradigms rooted in the late 1980s, not the new romanticized visual language of "Vapor Wave," but the old terminals with which most computers of the era shipped. These old trackers were designed for small resolution displays and, as such, look less than impressive when viewed on the monitors of today. They would hide away vital functions behind drop down menus due to the small display size. This system would embrace the modern common denominators and present the vital functions to the user without compromise.

In order to simply achieve operating system independence, the system would have to be written in a language that is easy to be deployed on Windows, macOS, and Linux. The JAVA language is our first choice, as the only factor is whether the host machine has the correct JAVA version installed. Another choice would be to write the system with web-based languages and deploy as a desktop application using the Electron technology.

## Context

Since the dawn of the modern age of computing, those with insatiable curiosity have taken great joy in expressing themselves by pushing the boundaries of what once was thought impossible with computers. These are the conditions in which the first music tracker programs were written and released. While there are trackers written for modern platforms, they still take their visual design cues from the trackers of yesteryear. It is high past time for a music tracker with modern conveniences and design sensibilities to be released.

Music tracker programs are built to generate sounds on computers. The user can select what pitch they want the note to have as well as what instrument or type of wave plays the note. The original pieces of music made with trackers are now known as "chip tune." Characteristically, these are defined by what the average person would describe as "beeps" and "boops." These are highly technical terms, indeed.

## Business Opportunity

In today's tracker market, most people would choose to use the venerable, modern, and free MilkyTracker, or a classic tracker offering, most likely hosted on a computer from the same era. If the flames of desire to release this project commercially cannot be extinguished, then either the feature-set must be unrivaled, or the user interface incredibly simple to understand, navigate, and use. Of course, that is only considering the release of the program as a stand alone product. Alternatively, the project could be released as a part of new digital audio workstation program, or as an extension to a preexisting one, such as Logic Pro or FLStudio.
