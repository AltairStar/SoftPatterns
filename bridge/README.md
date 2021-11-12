### Description
I create interface like ITV and add into this interface 3 methods(on, off, switchChannel)
Also I create abstraction like AbstractRemoteControl with implementation and features
We have two classes(SamsungTv and SonyTV) that implements the ITV interface (Concrete Implementations)
And also we have a class like LogitechRemoteControl that implements the AbstractRemoteControl class(Refined Abstraction)


### Example
Sony is turned on.
Sony: channel - 100
Logitech use keyword to set channel.
Sony is turned off.
Samsung is turned on.
Samsung: channel - 20
Logitech use keyword to set channel.
Samsung is turned off.

Process finished with exit code 0