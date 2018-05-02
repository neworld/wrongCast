package lt.neworld.app_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.foo.view.*

class FooView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
): FrameLayout(context, attrs, defStyle) {
    init {
        LayoutInflater.from(context).inflate(R.layout.foo, this)

        foo.text = "Foo"
    }
}