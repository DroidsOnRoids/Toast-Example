package pl.droidsonroids.shakedetector

import io.reactivex.Observable

class ShakeDetector(listener: OnShakeListener) {
    init {
        Observable.never<Nothing>()
                .subscribe { listener.onShake() }
    }
}